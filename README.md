# BFHL REST API

A Spring Boot REST API for the BFHL Java API Round task. It accepts an array of mixed values and returns categorized results for numbers, alphabets, and special characters.

## Live Endpoints

- `POST /bfhl`
- `GET /health`

## Repository

- GitHub: https://github.com/kritika0519/bajajtask-demo

## Tech Stack

- Java 17+
- Spring Boot 3.3.0
- Maven Wrapper

## What the API Returns

The `POST /bfhl` endpoint returns:

- `is_success`
- `user_id`
- `email`
- `roll_number`
- `odd_numbers`
- `even_numbers`
- `alphabets`
- `special_characters`
- `sum`
- `concat_string`

## Run Locally

### 1. Build

```bash
.\mvnw.cmd clean test
```

### 2. Start the application

```bash
.\mvnw.cmd spring-boot:run
```

The app runs on `http://localhost:8080`.

## Test the API

### POST `/bfhl`

```bash
curl -X POST http://localhost:8080/bfhl ^
  -H "Content-Type: application/json" ^
  -d "{\"data\":[\"a\",\"1\",\"334\",\"4\",\"R\",\"$\"]}"
```

Example response:

```json
{
  "is_success": true,
  "user_id": "kritika_aggarwal_19032005",
  "email": "kritikaaggarwal19@gmail.com",
  "roll_number": "2310991878",
  "odd_numbers": ["1"],
  "even_numbers": ["334", "4"],
  "alphabets": ["A", "R"],
  "special_characters": ["$"],
  "sum": "339",
  "concat_string": "Ra"
}
```

### GET `/health`

```bash
curl http://localhost:8080/health
```

Example response:

```json
{
  "is_success": true,
  "message": "Service is healthy"
}
```

## Deployment

Deploy the app on Railway, Render, or any platform that supports Spring Boot.

Use the public URLs in the submission form:

- POST `/bfhl` API URL: `https://your-domain/bfhl`
- GET `/health` API URL: `https://your-domain/health`
- GitHub Repository: `https://github.com/kritika0519/bajajtask-demo`
- Hosting Platform Used: `Railway` or `Render`

## Notes

- The API is already configured with your personal `user_id`, `email`, and `roll_number`.
- Numbers are returned as strings, as required by the task.
- The concatenation logic follows the task example for reversed alphabetical characters with alternating caps.
