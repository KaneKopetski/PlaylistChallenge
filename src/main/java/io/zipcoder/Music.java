package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        //create counter
        Integer counter = -1;
        //get array
        for (int i = startIndex; i < playList.length; i++) {
            //increment counter for each loop
            counter += 1;
            //iterate until it finds the value passed in
            if (playList[i].equals(selection)) {
                break;
            } else {
                continue;
            }
        }

        return counter;
    }
}
