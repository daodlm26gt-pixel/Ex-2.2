public class Testbook {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng các tác giả
        Author1[] authors = new Author1[2];
        authors[0] = new Author1("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author1("Paul Tan", "Paul@nowhere.com", 'm');

        // Khai báo và khởi tạo đối tượng Book1
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Gọi phương thức toString()

        // Kiểm tra các phương thức Getter và Setter
        javaDummy.setPrice(29.99);
        javaDummy.setQty(88);

        System.out.println("Name is: " + javaDummy.getName());
        System.out.println("Price is: " + javaDummy.getPrice());
        System.out.println("Qty is: " + javaDummy.getQty());
        System.out.println("Author names are: " + javaDummy.getAuthorNames());
    }
}