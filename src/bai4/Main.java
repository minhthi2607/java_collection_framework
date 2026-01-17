package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===========Menu=========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát chương trình");
            System.out.println("Lựa chọn của bạn");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập id sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phầm: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phầm");
                    double price = scanner.nextDouble();
                    productManager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.println("Nhập id cần sửa: ");
                    int find_id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên cần sửa :");
                    String newName = scanner.nextLine();
                    productManager.updateProduct(find_id, newName);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    int remove_id = scanner.nextInt();
                    productManager.removeProduct(remove_id);
                    break;
                case 4:
                    productManager.displayProducts();
                    break;
                case 5:
                    System.out.println("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;
                case 6:
                    productManager.sortByPriceAsc();
                    break;
                case 7:
                    productManager.sortByPriceDesc();
                    break;
                case 0:
                    System.exit(0);
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");


            }
        }


    }
}
