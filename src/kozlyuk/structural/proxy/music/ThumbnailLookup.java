package kozlyuk.structural.proxy.music;

import java.util.Arrays;
import java.util.Collections;

final class ThumbnailLookup {

    String thumbnailIdBySongId (String songId) {
        var idAsArray = Arrays.asList(songId.split(""));
        Collections.shuffle(idAsArray);
        final var builder = new StringBuilder();
        idAsArray.forEach(builder::append);
        return builder.toString();
    }

}
