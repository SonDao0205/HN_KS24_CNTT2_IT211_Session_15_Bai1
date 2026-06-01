Phần 1: Phân tích logic
Nguyên nhân gốc rễ khiến tài khoản user vẫn truy cập được /admin/orders nằm ở cấu hình hiện tại:
- Thiếu kiểm tra vai trò (Role-based Access Control): Câu lệnh .anyRequest().authenticated() chỉ kiểm tra xem người dùng đã đăng nhập thành công hay chưa (Principal != null). Nó không quan tâm người đó là ai hay giữ chức vụ gì. Vì user đã đăng nhập, Spring Security coi như thỏa mãn điều kiện authenticated().

- Thứ tự ưu tiên: Spring Security duyệt các requestMatchers từ trên xuống dưới. Khi một yêu cầu /admin/orders gửi đến, nó không khớp với /, nên nó rơi xuống anyRequest(). Tại đây, hệ thống chỉ yêu cầu "đã đăng nhập", dẫn đến lỗ hổng bảo mật.