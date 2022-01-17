package com.helpers;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public int[] inputIntegerArray() {
        try {
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            String arr = c.getData(DataFlavor.stringFlavor).toString().trim();
            arr = arr.substring(1, arr.length() - 1);
            String[] nums = arr.split(",");
            java.util.List<Integer> list = new ArrayList<>();
            for (String num : nums) {
                list.add(Integer.parseInt(num));
            }
            int n = list.size();
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = list.get(i);
            return result;
        } catch (UnsupportedFlavorException e) {
            System.out.println("What you have copied doesn't look like a string :)");
        } catch (IOException e) {
            System.out.println("IOException: Cannot retrieve data from copied string.");
        } catch (NumberFormatException e) {
            System.out.println("Looks like you haven't copied a one dimensional array to the clipboard");
        }
        return new int[] {};
    }
    public java.util.List<Integer> inputIntegerArraylist() {
        try {
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            String arr = c.getData(DataFlavor.stringFlavor).toString().trim();
            arr = arr.substring(1, arr.length());
            String[] nums = arr.split(",");
            java.util.List<Integer> list = new ArrayList<>();
            for (String num : nums) {
                list.add(Integer.parseInt(num));
            }
            return list;
        } catch (UnsupportedFlavorException e) {
            System.out.println("What you have copied doesn't look like a string :)");
        } catch (IOException e) {
            System.out.println("IOException: Cannot retrieve data from copied string.");
        } catch (NumberFormatException e) {
            System.out.println("Looks like you haven't copied a one dimensional array to the clipboard");
        }
        return new ArrayList<>();
    }
    public int[][] inputIntegerArray2d() {
        try {
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            String arr = c.getData(DataFlavor.stringFlavor).toString().trim();
            arr = arr.substring(1, arr.length() - 1);
            java.util.List<java.util.List<Integer>> resultArray = new ArrayList<>();
            for (int i = arr.indexOf('['), j = arr.indexOf(']'); i >= 0 && j >= 0; i = arr.indexOf('[', i + 1), j = arr.indexOf(']', j + 1)) {
                String s = arr.substring(i + 1, j);
                String[] nums = s.split(",");
                List<Integer> temp = new ArrayList<>();
                for (String num : nums)
                    temp.add(Integer.parseInt(num));
                resultArray.add(temp);
            }
            int m = resultArray.size();
            int n = resultArray.get(0).size();
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = resultArray.get(i).get(j);
                }
            }
            return result;
        } catch (UnsupportedFlavorException e) {
            System.out.println("What you have copied doesn't look like a string :)");
        } catch (IOException e) {
            System.out.println("IOException: Cannot retrieve data from copied string.");
        } catch (NumberFormatException e) {
            System.out.println("Looks like you haven't copied a two dimensional array to the clipboard");
        }
        return new int[][] {};
    }
}
