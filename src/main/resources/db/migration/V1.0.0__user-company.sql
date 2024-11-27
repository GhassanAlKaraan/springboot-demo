CREATE TABLE "user"(
  id UUID PRIMARY KEY DEFAULT(uuid_generate_v4()),
  firstname TEXT NOT NULL,
  lastname TEXT NOT NULL,
  email TEXT NOT NULL
);

INSERT INTO "user"
  (id, firstname, lastname, email)
VALUES
  ('5c029904-b691-473b-9651-6f427fb1845f','John', 'Doe', 'John@email.com'),
  ('5e14b773-969a-4a62-be85-8ec744d8240c','Jane', 'Smith', 'Jane@email.com');

CREATE TABLE company (
  id UUID PRIMARY KEY DEFAULT(uuid_generate_v4()),
  name TEXT NOT NULL,
  location TEXT NOT NULL
);

INSERT INTO company
  (id, name, location)
VALUES
  ('2fdf2a62-bd3a-44b5-b285-8b9ebe3c2027','gts','beirut'),
  ('b2e1bb25-4a71-4ae5-96bb-16285d3b56dd','apgar','jbeil');

