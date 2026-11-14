# Roadmap

Dom: a shared shopping list that grows into a household app.
`/next-feature` picks the first item that isn't `done`.

| # | Feature | Backend concepts | Status |
|---|---|---|---|
| 1 | Project skeleton + `GET /health` | HTTP, routing, JSON, Gradle, Spring Boot structure | done |
| 2 | Lists and items (create, read, update, delete), stored in memory | REST design, DTOs, validation, status codes, error handling | todo |
| 3 | Postgres + migrations (Flyway) | SQL, schema, relations, JPA vs JDBC, transactions, Docker Compose | todo |
| 4 | Tests | Unit vs integration tests, Testcontainers, the testing pyramid | todo |
| 5 | Accounts and login | Password hashing, sessions vs JWT, Spring Security | todo |
| 6 | Sharing a list with the household (invites) | **Authorization** (who can do what), many-to-many relations, expiring tokens | todo |
| 7 | Live sync (two people ticking items in the shop) | WebSockets or SSE, concurrency, optimistic locking | todo |
| 8 | Categories, sorting by shop aisle, search | Indexes, `EXPLAIN`, pagination, query performance | todo |
| 9 | "The usual weekly shop" + reminders | Scheduled jobs, background processing, idempotency | todo |
| 10 | Push notifications | Web Push, the outbox pattern, queues | todo |
| 11 | Deployment so you can really use it | Docker image, VPS, HTTPS (Caddy), configuration and secrets, backups | todo |
| 12 | Monitoring | Structured logs, metrics, health checks | todo |
| 13 | *(module)* A fair chore rota | Recurring assignment, scheduling, simple fairness logic | todo |
| 14 | *(comparison)* Sharing + live sync in Supabase | RLS, Supabase Auth, Realtime: what you get "for free" and what it costs | todo |

Status: `todo` → `in progress` → `done`.

## Ideas

Ideas that came up while working. They're not on the roadmap yet.
