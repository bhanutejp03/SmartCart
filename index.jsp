<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SmartCart - Modern Online Shopping</title>

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

    <!-- CSS -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<!-- Navbar -->
<nav class="navbar">
    <div class="nav-container">
        <a href="index.jsp" class="logo">
            <i class="fa-solid fa-cart-shopping"></i> SmartCart
        </a>

        <div class="nav-links">
            <a href="index.jsp" class="nav-link">Home</a>
            <a href="products.jsp" class="nav-link">Products</a>
            <a href="login.jsp" class="nav-link">Login</a>
            <a href="admin.jsp" class="nav-link">Admin</a>
        </div>

        <div class="nav-actions">
            <a href="cart.jsp" class="cart-btn">
                <i class="fa-solid fa-basket-shopping"></i>
                <span class="cart-badge">
                    <%= session.getAttribute("cartCount") != null ? session.getAttribute("cartCount") : 0 %>
                </span>
            </a>
        </div>
    </div>
</nav>

<!-- Main Content -->
<main>
    <h1>Welcome to SmartCart</h1>
    <p>Your one-stop shop for everything!</p>
</main>

<!-- Footer -->
<footer class="footer">
    <p>&copy; 2024 SmartCart. Student Mini Project.</p>
</footer>

</body>
</html>