void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nInput num: ");
    int num = scanner.nextInt();
    for(int i = 1; i<=num ; i++){
        if (i%2==0){
            System.out.println(i);
        }
    }
}
