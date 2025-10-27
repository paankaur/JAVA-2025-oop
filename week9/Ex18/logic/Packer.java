package week9.Ex18.logic;

import week9.Ex18.domain.Box;
import week9.Ex18.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;
    private List<Box> boxes = new ArrayList<Box>();

    public Packer(int volume) {
        this.boxesVolume = volume;
    }

    public List<Box> packThings(List<Thing> things) {

        int volume = 0;

        List<Thing> goInBox = new ArrayList<Thing>();

        for (Thing thing : things) {

            if (volume + thing.getVolume() <= boxesVolume) {
                volume += thing.getVolume();
                goInBox.add(thing);

            } else {


                createNewBox(goInBox);
                goInBox.clear();
                volume = 0;

                if (volume + thing.getVolume() <= boxesVolume) {
                    volume += thing.getVolume();
                    goInBox.add(thing);
                }
            }
        }


        if (volume > 0 && volume <= boxesVolume) {
            createNewBox(goInBox);
        }

        return boxes;
    }

    public void createNewBox(List<Thing> things) {

        Box box = new Box(boxesVolume);
        for (Thing thing : things) {
            box.addThing(thing);
        }
        boxes.add(box);
    }

}