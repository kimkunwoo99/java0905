package LibraryProject;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private ArrayList<Dto> bookList;
    private Scanner scanner;

    public View() {
        bookList = new ArrayList<>(); // ArrayList 초기화
        scanner = new Scanner(System.in);
    }

    // 시스템을 시작하는 메서드
    public void start() {
        int choice = 0;

        while (choice != 6) {
            System.out.println("======= 도서 관리 시스템 ========");
            System.out.println("\n메뉴:");
            System.out.println("1. 도서 정보 추가");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 출력");
            System.out.println("6. 종료");
            System.out.print("옵션을 선택하시오: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    displayBooks();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 옵션입니다. 다시 시도하세요.");
            }
        }

        scanner.close(); // Scanner 닫기
    }

    public void addBook() {
        System.out.print("ISBN을 입력하시오: ");
        String isbn = scanner.nextLine();

        System.out.print("제목을 입력하시오: ");
        String title = scanner.nextLine();

        System.out.print("작가를 입력하시오: ");
        String author = scanner.nextLine();

        System.out.print("출판사를 입력하시오: ");
        String publisher = scanner.nextLine();

        System.out.print("가격을 입력하시오: ");
        int price = Integer.parseInt(scanner.nextLine());

        Dto book = new Dto(isbn, title, author, publisher, price);
        bookList.add(book);
        System.out.println("책 등록 성공!");
    }

    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        System.out.println("등록된 책 목록:");
        for (Dto book : bookList) {
            System.out.println(book);
        }
    }

    public void updateBook() {
        System.out.print("수정할 ISBN을 입력하시오: ");
        String isbn = scanner.nextLine();
        Dto bookToUpdate = null;

        for (Dto book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                bookToUpdate = book;
                break;
            }
        }

        if (bookToUpdate == null) {
            System.out.println("해당 ISBN의 책을 찾을 수 없습니다.");
            return;
        }

        System.out.print("새 제목을 입력하시오 (현재 제목: " + bookToUpdate.getBookname() + "): ");
        String title = scanner.nextLine();
        System.out.print("새 작가를 입력하시오 (현재 작가: " + bookToUpdate.getAuthor() + "): ");
        String author = scanner.nextLine();
        System.out.print("새 출판사를 입력하시오 (현재 출판사: " + bookToUpdate.getPublisher() + "): ");
        String publisher = scanner.nextLine();
        System.out.print("새 가격을 입력하시오 (현재 가격: " + bookToUpdate.getPrice() + "): ");
        int price = Integer.parseInt(scanner.nextLine());

        bookToUpdate.setBookname(title);
        bookToUpdate.setAuthor(author);
        bookToUpdate.setPublisher(publisher);
        bookToUpdate.setPrice(price);
        System.out.println("책 정보가 수정되었습니다.");
    }

    public void deleteBook() {
        System.out.print("삭제할 ISBN을 입력하시오: ");
        String isbn = scanner.nextLine();
        boolean removed = false;

        for (Dto book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                bookList.remove(book);
                removed = true;
                System.out.println("책이 삭제되었습니다.");
                break;
            }
        }

        if (!removed) {
            System.out.println("해당 ISBN의 책을 찾을 수 없습니다.");
        }
    }
}