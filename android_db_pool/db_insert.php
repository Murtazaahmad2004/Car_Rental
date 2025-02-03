<?php
$conn = mysqli_connect("localhost", "root", "");
mysqli_select_db($conn, "car_rental");

$username = $_POST['username'];
$password = $_POST['password'];

$qry = "INSERT INTO `login_data` (`UserName`, `Password`) VALUES (NULL, '$username', '$password')";
mysqli_query($conn,$qry);

echo json_encode(array('response' => "Inserted Successfully"));
mysqli_close($conn);
?>