# Postern

A small, self-hostable feature-flag service. Turn features on or off, and choose who sees them, without redeploying.

> Status: under construction. Milestone M0 (project skeleton) in progress.

## Why

A feature flag is a named switch an app checks before showing a feature. Postern stores the switches, the rules for who gets what, and the history of every change.

## Planned features

- Flags with typed variations and per-environment rules
- Sticky percentage rollouts
- Audit log and safe concurrent edits (ETag and If-Match)
- Fast evaluation API backed by a cached snapshot

## Build and run

Requires Java 25 and Docker.

    docker compose up -d          # start PostgreSQL for local development
    ./mvnw verify                 # build and test (tests start their own PostgreSQL)
    ./mvnw -pl postern-server spring-boot:run
    curl http://localhost:8080/actuator/health

## License

MIT. See [LICENSE](LICENSE).