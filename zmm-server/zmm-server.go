package main

import (
	"os"
	"database/sql"
	"fmt"
	"net/http"
	"time"
	"strconv"
	"github.com/gin-gonic/gin"
	_ "github.com/go-sql-driver/mysql"

	"math"
)

func main() {

	const DB_HOST = "DB_HOST"
	const DB_PORT = "DB_PORT"
	const DB_NAME = "DB_NAME"
	const DB_USERNAME = "DB_USERNAME"
	const DB_PASSWORD = "DB_PASSWORD"

	var dataSourceName string
	dataSourceName = os.Getenv(DB_USERNAME) + ":" + os.Getenv(DB_PASSWORD) + "@tcp(" + os.Getenv(DB_HOST) + ":"
	if os.Getenv(DB_PORT) == "" {
		dataSourceName += "3306"
	} else {
		dataSourceName += os.Getenv(DB_PORT)
	}
	dataSourceName += ")/" + os.Getenv(DB_NAME) + "?parseTime=true"
	db, err := sql.Open("mysql", dataSourceName)
	if err != nil {
		fmt.Print(err.Error())
	}
	defer db.Close()
	// make sure connection is available
	err = db.Ping()
	if err != nil {
		fmt.Print(err.Error())
	}
	type Event struct {
		Id int
		Name string
		StartTime time.Time
	}
	router := gin.Default()

	// GET an event
	router.GET("/event/:id", func(c *gin.Context) {
		var (
			event Event
			result gin.H
		)
		id := c.Param("id")
		row := db.QueryRow("select id, Name, StartTime from Events where id = ?;", id)
		err = row.Scan(&event.Id, &event.Name, &event.StartTime)
		if err != nil {
			// If no results send null
			result = gin.H{
				"result": nil,
				"count":  0,
			}
		} else {
			result = gin.H{
				"result": event,
				"count":  1,
			}
		}
		c.JSON(http.StatusOK, result)
	})

	// GET all events
	router.GET("/events", func(c *gin.Context) {
		var (
			event  Event
			events []Event
		)
		var page int64
		var size int64
		var totalElements int64
		page, err = strconv.ParseInt(c.Query("page"), 10, 64)
		if page < 0 {
			page = 0
		}
		size, err = strconv.ParseInt(c.Query("size"), 10, 64)
		if size <= 0 {
			size = 20
		} else if size > 100 {
			size = 100
		}
		rowsCount := db.QueryRow("select count(*) as count from Events")
		rowsCount.Scan(&totalElements)
		rows, err := db.Query("select id, Name, StartTime from Events limit ? offset ?;", size, page * size)
		if err != nil {
			fmt.Print(err.Error())
		}
		for rows.Next() {
			err = rows.Scan(&event.Id, &event.Name, &event.StartTime)
			events = append(events, event)
			if err != nil {
				fmt.Print(err.Error())
			}
		}
		defer rows.Close()
		c.JSON(http.StatusOK, gin.H{
			"result": events,
			"page": gin.H{
				"size" : len(events),
				"totalElements" : totalElements,
				"totalPages" : math.Ceil(float64(totalElements)/float64(size)),
				"number" : page},
		})
	})

	router.Run(":3000")
}
