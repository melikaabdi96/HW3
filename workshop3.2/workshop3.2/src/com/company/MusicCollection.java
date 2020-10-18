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
    // An ArrayList for storing the musics.
    private ArrayList<Music> music;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        this.music = new ArrayList<>();

    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addMusic(String file, String artist, int yearOfPublicion) {
        if (!this.music.contains(file, artist, yearOfPublicion)){
            this.music.add(file, artist, yearOfPublicion);
        }else{
            System.out.println("It exist in your collection!");
        }
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfMusic()
    {
        return music.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listMusic(int index)
    {

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {

    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {

    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {

    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.

    }
}
