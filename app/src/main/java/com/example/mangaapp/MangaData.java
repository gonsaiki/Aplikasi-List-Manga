package com.example.mangaapp;

import java.util.ArrayList;

public class MangaData {
    private static String[] mangaTitles = {
            "Demon Slayer:Kimetsu no Yaiba",
            "One Piece",
            "Kingdom",
            "The Promised Neverland",
            "The Quintessential Quintuplets",
            "My Hero Academia",
            "Attack on Titan",
            "Haikyu!!",
            "Kaguya-sama:Love Is War",
            "That Time I Got Reincarnated as a Slime"
    };

    private static String[] mangaDescription = {
            "Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump terbitan Shueisha sejak bulan Februari 2016, dan telah dibundel menjadi tujuh belas volume tankōbon hingga bulan Oktober 2019. Seri ini diterbitkan dalam bahasa Inggris oleh Viz Media sementara Shueisha mulai merilis seri ini dalam bahasa Inggris secara serentak dengan perilisannya di Jepang melalui platform Manga Plus.",
            "Manga ini telah dimuat di majalah Weekly Shōnen Jump milik Shueisha sejak tanggal 22 Juli 1997, dan telah dibundel menjadi 91 volume tankōbon. Ceritanya mengisahkan petualangan Monkey D. Luffy, seorang anak laki-laki yang memiliki kemampuan tubuh elastis seperti karet setelah memakan Buah Iblis secara tidak disengaja.",
            "Sebuah seri manga seinen Jepang yang ditulis dan diilustrasikan oleh Yasuhisa Hara. Manga ini mengisahkan tentang periode Negara Perang dalam bentuk fiksi yang utamanya diceritakan melalui pengalaman dari seorang anak yatim bernama Xin dan rekan-rekannya dalam pertarungannya menjadi jenderal terbaik di bawah surga, dan dalam perjalanannya, berhasil menyatukan Tiongkok untuk pertama kalinya dalam sejarah.",
            "Seri manga shōnen yang ditulis dan diilustrasikan oleh Negi Haruba. Manga ini telah dimuat dalam majalah mingguan Weekly Shōnen Magazine milik Kodansha sejak bulan Agustus 2017 dan sejauh ini telah diterbitkan dalam bentuk sebelas volume tankōbon. Seri ini juga telah diterbitkan secara digital dalam bahasa Inggris oleh Kodansha USA melalui imprint Kodansha Comics milik mereka sejak tanggal 26 Juni 2018.",
            "Sebuah seri manga shōnen Jepang bertema pahlawan super yang ditulis dan diilustrasikan oleh Kōhei Horikoshi. Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump sejak bulan Juli 2014, dan telah dibundel menjadi 24 volume tankōbon hingga bulan Agustus 2019. Ceritanya mengisahkan tentang Izuku Midoriya, seorang anak lelaki tanpa kekuatan super (yang disebut quirk) di dunia tempat hal seperti itu sudah menjadi sesuatu yang umum, tetapi masih bercita-cita untuk menjadi seorang pahlawan.",
            "Sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Hajime Isayama. Ceritanya berlatar di dunia fantasi tempat umat manusia hidup di wilayah yang dikelilingi tiga lapis tembok besar, yang melindungi mereka dari makhluk pemakan manusia berukuran raksasa yang dikenal sebagai Titan.",
            "Sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Haruichi Furudate. Bab-bab tunggalnya telah dimuat dalam majalah Weekly Shōnen Jump sejak bulan Februari 2012. Seri ini pada awalnya dirilis sebagai cerita one shot dalam majalah musiman Jump NEXT! milik Shueisha sebelum dimuat berseri. Hingga bulan Maret 2019, tiga puluh enam volume tankōbon telah diterbitkan oleh Shueisha di Jepang. Manga ini telah dilisensi di Amerika Utara oleh Viz Media. Hingga bulan Januari 2018, Haikyu!! telah terjual sebanyak 28 juta kopi.",
            "Sebuah seri manga seinen Jepang yang ditulis dan diilustrasikan oleh Aka Akasaka. Seri ini telah diterbitkan dalam bahasa Inggris oleh Viz Media. Dua manga spin-off telah diterbitkan pada tahun 2018, dan sebuah adaptasi anime yang diproduksi oleh A-1 Pictures ditayangkan sejak bulan Januari hingga Maret 2019. Musim keduanya telah diumumkan.",
            "Seorang pria tertusuk oleh pencuri yang sedang lari saat dia mendorong teman kerjanya, diapun terkapar dan sedang menunggu ajalnya. Tiba-tiba dia mendengar sebuah suara aneh. Suara ini mengatakan beberapa penyesalan yang dimiliki sang pria, salah satunya adalah mengenai keperjakaannya yang membuatnya mendapatkan skill unik [Pertapa Agung]",
            "Manga Terrbitan terbaru yang menceritakan tentang rimuru tempest"
    };

    private static int[] coverManga = {
            R.drawable.demon_slayer,
            R.drawable.one_piece,
            R.drawable.kingdom,
            R.drawable.promised_neverland,
            R.drawable.gotoubun_hanayome,
            R.drawable.hero_academia,
            R.drawable.attack_titan,
            R.drawable.haikyu,
            R.drawable.kaguya_sama,
            R.drawable.tensura
    };

    private static String[] authorManga = {
            "Koyoharu Gotouge",
            "Eiichiro Oda",
            "Yasuhisa Hara",
            "Kaiu Shirai (Story) / Posuka Demizu (Art)",
            "Negi Haruba",
            "Kohei Horikoshi",
            "Hajime Isayama",
            "Haruichi Furudate",
            "Aka Akasaka",
            "Taiki Kawakami"
    };

    private static String[] publisherManga = {
            "Shueisha",
            "Shueisha",
            "Shueisha",
            "Shueisha",
            "Kodansha",
            "Shueisha",
            "Kodansha",
            "Shueisha",
            "Shueisha",
            "Kodansha"
    };

    private static String[] salesManga = {
            "12,057,628",
            "10,134,232",
            "7,661,361",
            "7,454,745",
            "5,895,000",
            "5,047,574",
            "4,704,234",
            "4,514,838",
            "4,096,492",
            "3,414,482"
    };

    public static ArrayList<Manga> getListData(){
        ArrayList<Manga> list = new ArrayList<>();
        for (int i = 0; i<mangaTitles.length; i++){
            Manga manga = new Manga();
            manga.setTitle(mangaTitles[i]);
            manga.setDescription(mangaDescription[i]);
            manga.setCover(coverManga[i]);
            manga.setAuthor(authorManga[i]);
            manga.setPublisher(publisherManga[i]);
            manga.setSales(salesManga[i]);
            list.add(manga);
        }
        return list;
    }


}

