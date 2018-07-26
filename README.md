# CommentRESTApi
REST api to validate the comments entered by the customers

Thank you message, when no objectionable content found and valid product
(Current valid product ids are 1 to 2147483647 (Integer.MAX_VALUE) else throw exception)
Appropriate response when objectionable content is found
Error message on invalid product Id

Example json input to be passes to the REST service
{
  "productId": 1,
  "comment": "Awesome Product"
}
