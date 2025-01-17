package github.javaguide.compress;

import github.javaguide.extension.SPI;


@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
