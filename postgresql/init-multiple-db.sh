#!/bin/bash
set -e

# Tạo các database
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
  CREATE DATABASE platform;
  CREATE DATABASE business;
EOSQL