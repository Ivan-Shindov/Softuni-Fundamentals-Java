package SongsProblem;

public class Songs {
    private String typeList;
    private String songName;
    private String time;

    Songs(String typeList,String songName, String time) {
        this.typeList = typeList;
        this.songName = songName;
        this.time = time;
    }
    Songs() {
    }

    public String getTypeList() {
        return typeList;
    }

    public String getSongName() {
        return songName;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
     public String toString() {
        String result = String.format("%s",this.songName);
        return result;
    }
}
