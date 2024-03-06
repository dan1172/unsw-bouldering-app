MVP 
- Users are able to log in and 
  - view currently published routes of the wall
  - submit routes to the wall
  - view progress and view previous routes theyve climbed


database

- top level controlelr 
  - attributes
    - stores list of all users
    - stores list of all submitted clibms
    - image/render of the bouldering wall thingo
  - methods
    - log in
    - log out
    - create account
    - log a climb as completed
    - log a new climb
    - list all climbs with/without filters and sorted/unsorted
    - delete a climb
    - get details of particular climb
    - edit info of particualr climb
    - leave comment on climb



- users
  - userid
  - handle name
  - password
  - list of what climbs they've previously done --> list of refernces to climbs
  - list of clibms they've created themselves --> list of refeerences
  - 


- climb
  - grade 
  - start holds
  - finish holds
  - foot only holds
  - hand/foot holds  (probably stored as ints? | stored on the 3d axis)
  - description of the climb 
  - comments from users