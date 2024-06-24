# Transportation API Collection
Deployed to: https://transaction-api-manuellaiv-b68dbde87c45.herokuapp.com

- GET /api/access/all: open to public
- GET /api/access/user: open to user and admin only
- GET /api/access/admin: open to admin only

- POST /api/auth/signup: sign up account
Example body:
```json
{
  "username": "manuellaiv_admin",
  "email": "manuellaivanauliawikwok@gmail.com",
  "password": "admin1234",
  "role": ["admin"]
}
```
```json
{
  "username": "manuellaiv_admin",
  "email": "manuellaivanauliawikwok@gmail.com",
  "password": "user1234",
  "role": ["user"]
}
```
- POST /api/auth/signin: sign in account
Example body:
```json
{
  "username": "manuellaiv2",
  "password": "manuella1234"
}
```
- GET /api/stops/all: get all stops
- GET /api/trips/search?sourceStopId=<...>&destStopId=<...>: get trips by stops
- GET /api/tripschedule/search?tripDate=<...>: get trips by date