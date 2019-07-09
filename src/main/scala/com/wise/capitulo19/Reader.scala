package com.wise.capitulo19

import java.awt.image.BufferedImage
import java.io.File

import javax.imageio.ImageIO

trait Reader {

  type In

  type Contents

  def read(in: In): Contents

}

class ImageReader extends Reader {

  type In = File

  type Contents = BufferedImage

  def read(file: In) = ImageIO.read(file)

}