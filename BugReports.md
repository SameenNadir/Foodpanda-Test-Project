# 🐞 Bug Reports — Foodpanda 

**Bug Logging Template (used below)**
- **Bug ID**: Unique identifier
- **Title**: Short descriptive title
- **Environment**: Browser/OS/Device/Build
- **Severity / Priority**: Critical/Major/Minor / P1/P2/P3
- **Steps to Reproduce**: Numbered steps
- **Expected Result**: What should happen
- **Actual Result**: What happened instead
- **Attachments**: Screenshots, logs, video (place file names here)
- **Status**: New / Assigned / Fixed / Retested / Closed

---

## BUG-FP-001: Login allows access with invalid password (Security)
- **Environment**: Windows 10, Chrome 116.0.5845.96
- **Severity / Priority**: Critical / P1
- **Steps to Reproduce**:
  1. Navigate to https://www.foodpanda.com/
  2. Click "Login"
  3. Enter registered email `testuser@example.com`
  4. Enter an incorrect password `wrongPassword123`
  5. Click "Submit"
- **Expected Result**: Login is rejected with error message "Invalid credentials".
- **Actual Result**: User is logged in and can access protected pages.
- **Attachments**: screenshots/login_invalid_password.png
- **Status**: New

---

## BUG-FP-002: Cart quantity not updating after adding same item twice (Functional)
- **Environment**: Android 12, Mobile Chrome
- **Severity / Priority**: Major / P1
- **Steps to Reproduce**:
  1. Open app/site and login
  2. Search for restaurant "KFC"
  3. Add "Zinger Burger" to cart
  4. Add "Zinger Burger" again
  5. Open Cart
- **Expected Result**: Cart should show quantity 2 and total price doubled.
- **Actual Result**: Cart shows quantity 1; subtotal not updated.
- **Attachments**: screenshots/cart_quantity_issue.png
- **Status**: New

---

## BUG-FP-003: Search input crashes with emoji characters (Stability)
- **Environment**: MacOS, Safari 16
- **Severity / Priority**: Critical / P1
- **Steps to Reproduce**:
  1. Open site
  2. Enter emoji 🍕🍔 in search field
  3. Press Enter
- **Expected Result**: System should either sanitize input or show 'No results found' without crashing.
- **Actual Result**: Page returns HTTP 500 and displays an error page.
- **Attachments**: logs/server_500_log.txt
- **Status**: New

---

## BUG-FP-004: Checkout button overlaps footer on 360x800 viewport (UI)
- **Environment**: Android mobile viewport 360x800
- **Severity / Priority**: Minor / P3
- **Steps to Reproduce**:
  1. Open site in mobile viewport
  2. Add item to cart and go to checkout
- **Expected Result**: Checkout button visible above footer and tappable.
- **Actual Result**: Checkout button overlaps with footer and is partially hidden.
- **Attachments**: screenshots/checkout_overlap.png
- **Status**: New

---

## BUG-FP-005: Order history missing recently placed orders (Data consistency)
- **Environment**: Windows 10, Chrome 116
- **Severity / Priority**: Major / P2
- **Steps to Reproduce**:
  1. Place an order using valid payment method
  2. Go to Profile -> Order History
- **Expected Result**: The newly placed order should appear at the top of order history.
- **Actual Result**: Recent order not listed; older orders displayed.
- **Attachments**: screenshots/order_history_missing.png
- **Status**: New