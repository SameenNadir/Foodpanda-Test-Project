# 🧾 Manual Test Cases — Foodpanda (Professional)

**Project Scope:** Login, Search, Cart, Checkout, Payment, Order History, Mobile responsiveness

| TC ID | Feature | Description | Preconditions | Steps | Expected Result | Status |
|-------|---------|-------------|---------------|-------|-----------------|--------|
| FP-TC-001 | Login | Valid login with email and password | User registered | 1. Open site 2. Click Login 3. Enter email 4. Enter password 5. Click Submit | User is redirected to homepage; user name shown | Pass |
| FP-TC-002 | Login | Invalid password - verify error message | User registered | 1. Open site 2. Click Login 3. Enter valid email 4. Enter invalid password 5. Click Submit | Error: "Invalid credentials" displayed and login blocked | Fail |
| FP-TC-003 | Login | Empty fields validation | - | 1. Open Login 2. Click Submit without entering anything | Validation messages shown for required fields | Pass |
| FP-TC-004 | Search | Search for a popular restaurant (e.g., KFC) | User on homepage | 1. Enter "KFC" in search 2. Submit | List of KFC restaurants displayed sorted by relevance | Pass |
| FP-TC-005 | Search | Search for gibberish returns no results | User on homepage | 1. Enter "asdjkl123" in search 2. Submit | Message "No restaurants found" displayed | Pass |
| FP-TC-006 | Restaurant Page | Add single item to cart and verify price | User logged in | 1. Search restaurant 2. Select restaurant 3. Add single item to cart | Cart shows item, correct unit price and subtotal | Pass |
| FP-TC-007 | Cart | Add same item twice and verify quantity & price update | Item available | 1. Add same item twice | Quantity increments to 2; total price updated accordingly | Fail |
| FP-TC-008 | Cart | Remove item from cart | Item in cart | 1. Go to cart 2. Click Remove on an item | Item removed and cart subtotal updated | Pass |
| FP-TC-009 | Checkout | Attempt checkout with empty cart | User logged in | 1. Open cart 2. Click Checkout | System blocks checkout and shows message "Cart is empty" | Pass |
| FP-TC-010 | Checkout | Checkout with saved address and COD | User with saved address | 1. Add item 2. Checkout 3. Select Cash on Delivery 4. Confirm order | Order placed; confirmation number shown | Pass |
| FP-TC-011 | Payment | Enter invalid card details (card number fails Luhn) | User proceeding to card payment | 1. Enter invalid card number 2. Submit payment | Payment rejected; clear error message displayed | Pass |
| FP-TC-012 | Order History | Newly placed order appears in Order History | User placed an order | 1. Go to Order History | Latest order is visible with correct status | Fail |
| FP-TC-013 | Mobile UI | Checkout button visible and usable on 375x812 viewport | Mobile viewport | 1. Open site with mobile viewport 2. Go to checkout | Button visible and tappable; no overlap | Pass |
| FP-TC-014 | Security | Session expires after logout | User logged in | 1. Login 2. Logout 3. Hit back button | User is not able to access protected pages; redirected to login | Pass |

**How to document**: Use screenshots and timestamps when executing. For failures, include browser console logs and network traces where possible.