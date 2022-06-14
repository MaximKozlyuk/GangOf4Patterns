package kozlyuk.structural.facade;

import java.net.URI;
import java.net.URISyntaxException;

public class Client {

    public void facadeExample() throws URISyntaxException {
        Compression comp = new CompressionFacade();
        URI source = new URI("./test.txt");
        URI target = new URI("./target.txt");
        comp.compress(source, target, CompressionRatio.FAST);
    }

}
