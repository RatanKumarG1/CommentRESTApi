# CommentRESTApi
REST api to validate the comments entered by the customers

Thank you message, when no objectionable content found and valid product
(Current valid product ids are 1, 2, 3 throw error other than 1,2,3 )
Appropriate response when objectionable content is found
Error message on invalid product Id

Example json input to be passes to the REST service
{
  "productId": 1,
  "comment": "Awesome Product"
}
