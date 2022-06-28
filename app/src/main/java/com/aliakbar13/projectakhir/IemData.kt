package com.aliakbar13.projectakhir

object IemData {

    private val iemNames = arrayOf("BLON BL03 Carbon Earphone Diaphgram 10mm Hifi DD Original",
        "CCA CRA with Mic In Ear Monitor HiFi Headset Noise Cancelling Earphone",
        "CCA NRA with 3 Magnetic Dynamic + Electrostatic Drive Unit Earphone",
        "HZSOUND Heart Mirror with Mic Carbon Nanometer Diaphragm Earphone",
        "MOONDROP SSP Super Spaceship Pulse Beryllium Plated Dome IEM",
        "Moondrop SSR Super Spaceship Reference 0.78 2pin Detachable IEM",
        "Moondrop Stardust SSR Super Spaceship Reference Limited Edition MOEYU",
        "TANCHJIM TANYA with Mic Dynamic Driver Harman Target HIFI Earphone",
        "TIN HIFI T2 Plus NanoPure Dynamic Drive In Ear Earphone with MMCX",
        "TIN HIFI TKZK WAVE 1DD+1BA Hybrid Driver Units HIFI In Ear Earphone")

    private val iemPrice = arrayOf("325.000",
        "250.000",
        "435.000",
        "500.000",
        "665.000",
        "550.000",
        "750.000",
        "245.000",
        "535.000",
        "600.000")

    private val shortReviews = arrayOf("Vshaped yang cukup balance",
        "Vshaped fun, bass boost dalam, treble tinggi extended",
        "Mild Vshaped, dibanding cca lain, salah satu yang ter-balance",
        "Mild Vshaped, teknikal melebihi harganya",
        "Vshaped, ssr yang lebih balance tetapi kurang detail",
        "DF neutral shouty, bening tapi kurang balance",
        "DF neutral-ish, bening, tidak se-shouty SSR",
        "Smooth harman-ish warm, tonal aman, treble lumayan buntung",
        "V shaped yang cukup balance, teknikal baik",
        "neutral bright, sangat detail, tapi kurang natural")

    private val iemDetails = arrayOf("Specification:\n" +
            "1. Product Name: Original BLON BL-03 In-ear Earphone\n" +
            "2. Brand: BLON\n" +
            "3. Model: BL-03\n" +
            "4. Earphone type: In-ear\n" +
            "5. Impedance: 32Ω\n" +
            "6. Earphone sensitivity: 102dB/mW\n" +
            "7. Frequency range: 20-20000Hz\n" +
            "8. Interface: 3.5mm Gilded\n" +
            "9. Plug Type: L curved\n" +
            "10.Cable Length: 1.2m±3cm\n" +
            "11.Color: SILVER, BROWN\n" +
            "12.Whether with cable: Yes\n" +
            "13.Earphone interface: 2Pin 0.78MM connector\n" +
            "14.Whether with mic: Optional\n",

        "Brand: CCA\n" +
                "Model: CRA\n" +
                "Impedance: 34Ω\n" +
                "Sensitivity: 105dB\n" +
                "Frequency: 20-40000Hz\n" +
                "Wearing: Earhook\n" +
                "Color: Black/Silver\n" +
                "Connector: 3.5mm\n" +
                "Interface: 2Pin 0.75mm\n" +
                "Driver: High Polymer Diaphragm\n" +
                "\n" +
                "About Cable\n" +
                "Cable length: 1.25±0.05m\n" +
                "Oxygen-free copper flat cable\n" +
                "\n" +
                "About the box\n" +
                "1 Pair CRA\n" +
                "1 PC cable\n" +
                "3 Pairs eartips\n" +
                "Instructions for use and warranty\n",

        "1. Product Name: CCA NRA\n" +
                "2. Brand: CCA\n" +
                "3. Model:NRA\n" +
                "4. Earphone type: In Ear\n" +
                "5. Impedance: 25Ω±10%\n" +
                "6. Earphone sensitivity: 103db±3db\n" +
                "7. Frequency response range:20Hz-40KHz\n" +
                "8. Plug Type: 3.5mm straight\n" +
                "9. Cable Length: 1.2m\n" +
                "10.Color: Cyan\n" +
                "11.Whether with cable: Yes\n" +
                "12.Earphone connector:2pin connector\n" +
                "13.Whether with mic: No mic/With mic\n" +
                "14.Whether can replacement cable: Yes\n" +
                "15.Driver unit: 1 Electrostatic drive units+ 1 3*Magnetic Dynamic unit",

        "Specification:\n" +
                "\n" +
                "1. Product Name: HZSOUND Heart Mirror\n" +
                "2. Brand: HZSOUND\n" +
                "3. Model: Heart Mirror\n" +
                "4. Earphone type: In-ear\n" +
                "5. Impedance: 32Ω(±15%)\n" +
                "6. Speaker Sensitivity: 106±3dB\n" +
                "7.Microphone sensitivity: -42±3dB\n" +
                "8. Frequency range: 15Hz-40kHz\n" +
                "9. Connector: 2Pin 0.78mm\n" +
                "10. Plug Type: 3.5mm L type\n" +
                "11.Cable: 1.2m, OFC silver plated\n" +
                "12.Color: Silver\n" +
                "13.Driver unit: 10mm driver unit",

        "Product Specifications:\n" +
                "Frequency Response: 20-20000Hz(IEC60318-4)\n" +
                "Frequency Response: 20-40000Hz(1/4 Inch Free field Mic)\n" +
                "Impedance: 16Ω@1kHz\n" +
                "Sensitivity: 112dB/Vrms@1kHz\n" +
                "THD: <=1%\n" +
                "Housing Material: Amorphous Metal Alloy Housing\n" +
                "Diaphragm: Beryllium-Coated Dome+PU Suspension Ring\n" +
                "Coil: 0.035mm-CCAW(Daikoku)\n" +
                "Magnet: N52-Neodymium High Density Magnetic Circuit\n" +
                "Acoustic Fiter: Patented Anti-blocking Filter",

        "Earphone Specification :\n" +
                "- Frequency Response: 20-20000HZ (EC60318-4) / 20-40000Hz (% Inch Free field MIc)\n" +
                "- Impedance: 16ohm@l000Hz\n" +
                "- THD:<=1%\n" +
                "- Housing Material: Liquid Metal AIIoy Housing\n" +
                "- Disphragm: BeryIIium-Coated Dome+PU suspension Ring\n" +
                "- Coil: 0.035mm-CCAW (Daikoku)\n" +
                "- Magnet: N52-High Density Magnetic Circuit\n" +
                "- Acoustic Fiter: Platented Anti-blocking Filter\n" +
                "- Cable: Silver Plated 4N-Litz OFC\n" +
                "- Connectors: 0.78 - 2 Pin",

        "MOONDROP STARDUST.\n" +
                "KOLAB MOONDROP X MOEYU\n" +
                "\n" +
                "SSR LIMITED EDITION. HANYA DIJUAL DI CHINA.\n" +
                "\n" +
                "\n" +
                "DETACH 2PIN 0.78\n" +
                "\n" +
                "Kelengkapan:\n" +
                "1 x SSR Stardust\n" +
                "1 x 2pin cable starfield\n" +
                "1 x Stardust Card\n" +
                "1 x Stardust Cable clip\n" +
                "3 pair eartips\n" +
                "1 x pouch",

        "Follows Harman Curve.\n" +
                "The Tanchjim Tanya has been tuned to the reference Harman IE curve. It has gone through many revisions based on multiple listener feedback. The result with the Tanya is a superbly warm, smooth sound signature.\n" +
                "\n" +
                "Crafted With Perfection.\n" +
                "Tanchjim Tanya features a small, lightweight bullet-shaped design crafted with anode-sandblasted aviation-grade aluminum alloy material. The Inner cavity is made using durable titanium-alloy material with anti-dust mesh to avoid any dust issues in the driver",

        "Earphone Specification :\n" +
                "- Tin Hifi\n" +
                "- Drivers: 10 mm NanoPure nickel-zinc alloy dynamic drivers\n" +
                "- Sensitivity: 104 ± 3 dB at 1 kHz, 0.126V\n" +
                "- Frequency response: 10 Hz – 20 kHz\n" +
                "- Impedance: 32 ohms ± 15%\n" +
                "- Rated power: 3 mW\n" +
                "- Maximum power: 5 mW\n" +
                "- Maximum distortion: 1% at 1 kHz, 0.126V\n" +
                "- Input: Gold-plated MMCX connector\n" +
                "- Termination: 3.5 mm black carbon multi-dimensional heavy plug\n" +
                "- Cable: 4-core silver-plated Kevlar-enameled 22AWG copper cable",

        "TKZK WAVE 1DD+1BA Hybrid 2 Driver Units Resin HIFI In Ear Earphone\n" +
                "\n" +
                "Monitor Running Sport Headset DJ Earbud With 0.75mm 2Pin IEM\n" +
                "1. Product Name:TKZK WAVE HIFI Audiophile In-ear Earphone\n" +
                "2. Brand:TKZK\n" +
                "3. Model:WAVE\n" +
                "4.Product Type: In-ear\n" +
                "5.Color:Blue/Gray Silver\n" +
                "6. Impedance:22Ω\n" +
                "7.Shell Material: Resin\n" +
                "8. Eerphone Sensitivity: 110dB/mW\n" +
                "9. Frequency Range: 10-40000Hz\n" +
                "10. Earphone plug type:3.5mm\n" +
                "11.Connector:Detachable 0.75mm 2pin\n")

    private val iemImages = intArrayOf(R.drawable.blon_bl03,
        R.drawable.cca_cra,
        R.drawable.cca_nra,
        R.drawable.hzsound_heartmirror,
        R.drawable.moondrop_ssp,
        R.drawable.moondrop_ssr,
        R.drawable.moondrop_stardust,
        R.drawable.tanchjim_tanya,
        R.drawable.tinhifi_t2plus,
        R.drawable.tkzk_wave)

    val listData: ArrayList<Iem>
        get() {
            val list = arrayListOf<Iem>()
            for (position in iemNames.indices) {
                val iem = Iem()
                iem.name = iemNames[position]
                iem.price = iemPrice[position]
                iem.shortReview = shortReviews[position]
                iem.detail = iemDetails[position]
                iem.photo = iemImages[position]
                list.add(iem)
            }
            return list
        }
}