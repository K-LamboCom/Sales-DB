COMPOSE_FILE := docker-compose.yml

.PHONY: up down start stop restart build logs

up:
	docker compose -f $(COMPOSE_FILE) up -d

down:
	docker compose -f $(COMPOSE_FILE) down --rmi local

restart:
	docker compose -f $(COMPOSE_FILE) restart

build:
	docker compose -f $(COMPOSE_FILE) build

logs:
	docker compose -f $(COMPOSE_FILE) logs -f --tail=100
