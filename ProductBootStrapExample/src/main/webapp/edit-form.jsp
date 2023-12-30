<!DOCTYPE html> 
<html> 
<head> 
 <title>Add Product</title> 
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> 
 <script src="formvalidation.js"></script> 
</head> 
<body> 
 <div class="container mt-5 text-center"> 
  <h2 class="text-center font-italic mb-1">Edit Product Data...</h2> 
  <form method="post" action="./UpdateProductServlet" enctype="multipart/form-data" onsubmit="return validateForm()"> 
   <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proId">Product ID:</label> 
    <input type="text" class="form-control-sm" id="proId"  name="proId" value="${existingProduct.proId}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proName">Product Name:</label> 
    <input type="text" class="form-control-sm" id="proName" name="proName" value="${existingProduct.proName}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proPrice">proPrice:</label> 
    <input type="text" class="form-control-sm" id="proPrice"  name="proPrice" value="${existingProduct.proPrice}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proBrand">proBrand:</label> 
    <input type="text" class="form-control-sm" id="proBrand" name="proBrand" value="${existingProduct.proBrand}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proMadeIn">Made In:</label> 
    <input type="text" class="form-control-sm" id="proMadeIn"  name="proMadeIn" value="${existingProduct.proMadeIn}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proMfgDate">Mfg Date:</label> 
    <input type="date" class= "form-control-sm" id="proMfgDate" name="proMfgDate" value="${existingProduct.proMfgDate}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proExpDate">Expiry Date:</label> 
    <input type="date" class="form-control-sm" id="proExpDate"  name="proExpDate" value="${existingProduct.proExpDate}" required> 
    </div> 
    <div class="form-group"> 
    <label class="font-italic font-weight-bold" for="proImage">Product Image:</label> 
    <input type="file" class="form-control-sm" id="proImage" name="proImage" value="${existingProduct.proImage }" > 
    </div> 
    <div> 
    <input type="submit" class="btn btn-success" value="update product"/>  
    <a href="productList.jsp" class="btn btn-primary">List of Products</a> 
    </div> 
   </form> 
  </div> 
     
</body> 
</html>