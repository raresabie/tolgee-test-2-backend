package io.tolgee.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\n #*\u0004\u0018\u00010\u001c0\u001cH\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)H\u0002J&\u0010*\u001a\u00020+2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001f\u001a\u00020 J\u0010\u0010-\u001a\u00020+2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010\u00a8\u0006."}, d2 = {"Lio/tolgee/util/ImageConverter;", "", "imageStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "imageWriter", "Ljavax/imageio/ImageWriter;", "getImageWriter", "()Ljavax/imageio/ImageWriter;", "setImageWriter", "(Ljavax/imageio/ImageWriter;)V", "resultBufferedImage", "Ljava/awt/image/BufferedImage;", "getResultBufferedImage", "()Ljava/awt/image/BufferedImage;", "setResultBufferedImage", "(Ljava/awt/image/BufferedImage;)V", "resultingTargetDimension", "Ljava/awt/Dimension;", "getResultingTargetDimension", "()Ljava/awt/Dimension;", "setResultingTargetDimension", "(Ljava/awt/Dimension;)V", "sourceBufferedImage", "getSourceBufferedImage", "setSourceBufferedImage", "convertToBufferedImage", "img", "Ljava/awt/Image;", "colorSpace", "", "format", "", "resizedImage", "getScaledImage", "kotlin.jvm.PlatformType", "getTargetDimension", "getWriter", "getWriterParams", "Ljavax/imageio/ImageWriteParam;", "compressionQuality", "", "prepareImage", "Ljava/io/ByteArrayOutputStream;", "targetDimension", "writeImage", "data"})
public final class ImageConverter {
    private final java.io.InputStream imageStream = null;
    public java.awt.image.BufferedImage sourceBufferedImage;
    public java.awt.image.BufferedImage resultBufferedImage;
    public java.awt.Dimension resultingTargetDimension;
    public javax.imageio.ImageWriter imageWriter;
    
    public ImageConverter(@org.jetbrains.annotations.NotNull()
    java.io.InputStream imageStream) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.awt.image.BufferedImage getSourceBufferedImage() {
        return null;
    }
    
    public final void setSourceBufferedImage(@org.jetbrains.annotations.NotNull()
    java.awt.image.BufferedImage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.awt.image.BufferedImage getResultBufferedImage() {
        return null;
    }
    
    public final void setResultBufferedImage(@org.jetbrains.annotations.NotNull()
    java.awt.image.BufferedImage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.awt.Dimension getResultingTargetDimension() {
        return null;
    }
    
    public final void setResultingTargetDimension(@org.jetbrains.annotations.NotNull()
    java.awt.Dimension p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.imageio.ImageWriter getImageWriter() {
        return null;
    }
    
    public final void setImageWriter(@org.jetbrains.annotations.NotNull()
    javax.imageio.ImageWriter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.ByteArrayOutputStream prepareImage(float compressionQuality, @org.jetbrains.annotations.Nullable()
    java.awt.Dimension targetDimension, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    private final java.io.ByteArrayOutputStream writeImage(float compressionQuality) {
        return null;
    }
    
    private final javax.imageio.ImageWriteParam getWriterParams(float compressionQuality) {
        return null;
    }
    
    private final java.awt.image.BufferedImage getResultBufferedImage(java.lang.String format, java.awt.Image resizedImage) {
        return null;
    }
    
    private final java.awt.Image getScaledImage() {
        return null;
    }
    
    private final javax.imageio.ImageWriter getWriter(java.lang.String format) {
        return null;
    }
    
    private final java.awt.Dimension getTargetDimension() {
        return null;
    }
    
    private final java.awt.image.BufferedImage convertToBufferedImage(java.awt.Image img, int colorSpace) {
        return null;
    }
}