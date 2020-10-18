package com.company;


import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author Melika
 * @version 2020
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection(MusicPlayer player)
    {
        this.files = new ArrayList<String>();
        this.player = player;
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String fileName)
    {
        if (!this.files.contains(fileName)){
            this.files.add(fileName);
        }else{
            System.out.println("it exists");
        }
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        return files.get(index);
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (String file : files){
            System.out.println(file);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (files.contains(files.get(index))) {
            files.remove(index);
        }

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (files.contains(files.get(index))){
            player.startPlaying(files.get(index));
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    public boolean validIndex(int index)
    {
        if (files.contains(files.get(index))){
            return true;
        }else{
            System.out.println("invalid input!");
        }
    }
// The return value.
// Set according to whether the index is valid or not.

}

