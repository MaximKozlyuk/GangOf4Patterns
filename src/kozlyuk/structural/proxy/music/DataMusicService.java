package kozlyuk.structural.proxy.music;

import kozlyuk.structural.proxy.music.user.UserSession;
import kozlyuk.structural.proxy.util.DataSender;

import java.io.*;

class DataMusicService implements MusicService {

    private final DataSender sender;

    public DataMusicService(UserSession userSession) {
        this.sender = new DataSender(userSession.user.getNetworkAddress());
    }

    @Override
    public void streamSong(String songId) {
        try {
            sender.sendData(
                    readSongFromFileSystem(songId)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private byte[] readSongFromFileSystem(String songId) {
        return new byte[]{1, 2, 6, 7, 4, 33, 87};
    }

}
