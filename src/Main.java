void main() {
    Scanner NUM1 = new Scanner (System.in);


    int a = NUM1.nextInt(), b = NUM1.nextInt(), c = NUM1.nextInt();
    String V = "The greatest number is: ";
    if (a > b && a > c){
        System.out.println(V + a);
    } else if (b > a && b > c){
        System.out.println(V + b);
    } else if ( c > a && c > b){
        System.out.println(V + c);
    }
}


