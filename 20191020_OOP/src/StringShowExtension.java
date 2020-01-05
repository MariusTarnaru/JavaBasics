public class StringShowExtension {

    public static String showExtension(String fileName) {
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (lastIndexOfDot == -1) {
            return "-";
        }
        String ext = fileName.substring(lastIndexOfDot + 1);
        ext = ext.trim();
        ext = ext.toLowerCase();
        return ext;
    }

    public static void main(String[] args) {
        System.out.println(showExtension("input.txt"));
        System.out.println(showExtension("input.PDF"));
        System.out.println(showExtension("myFile.name.xlS"));
        System.out.println(showExtension("MyClass.java"));
        System.out.println(showExtension("MyClass.class  "));
        System.out.println(showExtension("MyProgram....EXE"));
        System.out.println(showExtension("MyProgram.  EXE"));
        System.out.println(showExtension("input."));
        System.out.println(showExtension("input2.   "));
        System.out.println(showExtension("test"));
        System.out.println(showExtension(".test"));
    }

}
