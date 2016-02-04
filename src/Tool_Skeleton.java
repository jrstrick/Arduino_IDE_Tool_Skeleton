/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*

  Copyright (c) 2015 James R. Strickland
  Based on Mangler (which no longer builds) by Ben Fry and Casey Reas

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

//Change the package name as you see fit, but don't move com.- You'll
//mess up the paths. It needs to be com.<your_package_name>
package com.tool_skeleton;

//All your imports go here. This can get rather lengthy.

//These are standard java imports.
import java.text.SimpleDateFormat;
import java.util.Date;

//I'm not entirely sure what this is. I /think/ it's a 
//Java addon from something called swing, but what swing is
//I really have no idea. Java is not my native language.
import javax.swing.JOptionPane;

//These are part of Processing, the easy-programming tool
//that the Arduino app was built from. Note that Arduino
//forked from processing some time ago, so no grabbing the
//latest Processing and trying to make sense of it for the Arduino app.
import processing.app.Editor;
import processing.app.tools.Tool;


//Public Class boilerplate. Change only the class name to suit your project.
public class Tool_Skeleton implements Tool {
  Editor editor;

//Init boilerplate. Don't change, we need the editor object.
  public void init(Editor editor) {
    this.editor = editor;
  }

//Menu title boilerplate. Change the return string to suit your project.
  public String getMenuTitle() {
    return "Tool Skeleton";
  }

//All your code?  It goes in here.
  public void run() {
        System.out.println("Hello from Tool_Skeleton");
  }
 
}
