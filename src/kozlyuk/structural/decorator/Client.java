package kozlyuk.structural.decorator;

import kozlyuk.structural.decorator.textstream.CaseChangeTextStream;
import kozlyuk.structural.decorator.textstream.DefaultTextStream;
import kozlyuk.structural.decorator.textstream.NoWhiteSpaceTextStream;
import kozlyuk.structural.decorator.textstream.TextStream;

import java.io.*;

public final class Client {

    public void textStreamExample() {
        try {
            System.out.println("Default:");
            DefaultTextStream defaultTextStream = new DefaultTextStream(getNewTestReader());
            printTextStream(defaultTextStream);
            defaultTextStream.setReader(getNewTestReader());

            System.out.println("\nNo white space:");
            NoWhiteSpaceTextStream noWhiteSpace = new NoWhiteSpaceTextStream(defaultTextStream);
            printTextStream(noWhiteSpace);
            defaultTextStream.setReader(getNewTestReader());

            System.out.println("\nCase:");
            CaseChangeTextStream caseStream = new CaseChangeTextStream(noWhiteSpace, true);
            printTextStream(caseStream);
            defaultTextStream.setReader(getNewTestReader());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printTextStream(TextStream stream) throws IOException {
        char read;
        while ((read = stream.nextChar()) != Character.MIN_VALUE) {
            System.out.print(read);
        }
    }

    private Reader getNewTestReader() throws FileNotFoundException {
        File file = new File("./src/kozlyuk/structural/decorator/text.txt");
        InputStream input = new FileInputStream(file);
        Reader reader = new InputStreamReader(input);
        return new BufferedReader(reader);
    }

}
