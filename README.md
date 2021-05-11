# Example Spring App: Employee API

This is a simple REST app with one endpoint to return a single employee: http://localhost:8080/api/dummyEmployee

## Challenge

- Extend the app with an additional endpoint `/api/employee/emaillist`
- This endpoint should return a list of employee IDs and emails like this:
```JSON
[
  {
    "id": "6df640ae-b271-11eb-8529-0242ac130003",
    "email": "arthur@b42.com"
  },
  {
    "id": "83199ae4-b271-11eb-8529-0242ac130003",
    "email": "bond@james.bond"
  }
]
```
- The controller should use the `EmployeeService.getAll()` as a data source
- Create a new DTO `EmployeeEmailDTO` to represent the simplified Employee for the new endpoint
- Finally write a test for the DTO that checks serialization and deserialization

**Bonus:**
- Extend the `EmployeeService` with a method to get an employee by UUID: `getEmployee(UUID)` and write a test for it
- Extra points if you manage to write a controller test for the new email list endpoint


# Notes

- Please try to solve this challange on your own and try to understand the concepts you used.
- Feel free to abort if this challenge takes too long, we can still discuss the challenges you faced => Der Weg ist das Ziel
- An IDE like IntelliJ (use a Trial) or eclipse is helpful to run this code out of the box.
- Before you start make sure the example endpoint works: http://localhost:8080/api/dummyEmployee 


