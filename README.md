# Transformers
REST API for Aequilibrium application

# Config
Spring boot application, run Configuration.java file

# Docs
I've add the swagger docs: /swagger-ui.html#/
     
# Urls
GET] http://aeq.com/api/transformers (returns all transformers)
<br>[GET] http://aeq.com/api/transformer/{id} (returns a transformer with {id})
<br>[POST] http://aeq.com/api/transformer (create new transformer)
<br>[PUT] http://aeq.com/api/transformer/ (update transformer)
<br>[DELETE] http://aeq.com/api/transformer/1 (delete transformer with {id})

# Assumptions:
  <li>I'm returning the name of the survivers of the winning team as well. 
  <br>(I wasn't sure if I should display the whole team in that case, but I thought it would make more sense to display only the survivers.)
  <li>I'm using the transformers names as ids, so duplicates are not possible.
  <li>I didn't use any database for this project.
  <li>I'm returning only JSON.
