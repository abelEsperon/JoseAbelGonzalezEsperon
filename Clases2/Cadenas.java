
class Cadenas {

    public static void main(String[] args) {
        // "  Buried Treasure Chest! "
        // "012345678910111213141516171819202122232425"
        String pirateMessage = "Buried Treasure Chest! ";

        //charAt(int index)

        System.out.print(pirateMessage.charAt(0));
        System.out.print(pirateMessage.charAt(10));
        System.out.print(pirateMessage.charAt(11));
        System.out.print(pirateMessage.charAt(13));
        
        //indexOf (int ch) indice de
        System.out.println("\n------.indexOf()------");
        System.out.println(pirateMessage.indexOf('i'));
        System.out.println(pirateMessage.indexOf("sure"));

        //length()
        System.out.println(pirateMessage.length());
    }
}