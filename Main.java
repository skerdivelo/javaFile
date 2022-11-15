class Main{
    public static void main(String []args){
        TextFile out = new TextFile("file.txt", 'W');
        try{
            out.toFile("Riga 1");
            out.toFile("Riga 2");
            out.toFile("Riga 3");
        }
        catch(FileException exception){
            System.out.println(exception.getMatter());
        }
        out.closeFile();

        TextFile in = new TextFile("file.txt", 'R');
        String line;
        try {
            while(true){
                line = in.fromFile();
                System.out.println(line);
            }
        }
        catch (FileException exception){
            System.out.println(exception.getMatter());
        }
        out.closeFile();
    }
}