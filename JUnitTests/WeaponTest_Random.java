import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teamproject.cs320.Weapon;

class WeaponTest_Random {

	@Test
	void testAllNamesCorrect() {
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}	
	}


	@Test
	void testGloves() {
		int glovesCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of 61 Weapons, Gloves is never found");
		} else if(glovesCount == 61) {
			fail("Only Glove weapons are created");
		}
	}
	
	@Test
	void testKnife() {
		int knifeCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of 61 Weapons, Knife is never found");
		} else if(knifeCount == 61) {
			fail("Only knife weapons are created");
		}
		
	}
	
	@Test
	void testMachette() {
		int machetteCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
			
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of 61 Weapons, Machette is never found");
		} else if(machetteCount == 61) {
			fail("Only Machette weapons are created");
		}
	
	}
	
	@Test
	void testHandgun() {
		int handgunCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of 61 Weapons, Handgun is never found");
		} else if(handgunCount == 61) {
			fail("Only Handgun weapons are created");
		}
	}
	
	@Test
	void testSword() {
		int swordCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of 61 Weapons, Sword is never found");
		} else if(swordCount == 61) {
			fail("Only Sword weapons are created");
		}
	}
	
	@Test
	void testAllNames() {
		int glovesCount = 0;
		int knifeCount = 0;
		int machetteCount = 0;
		int handgunCount = 0;
		int swordCount = 0;
		
		// Initialize weapons
		Weapon w0 = new Weapon();
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		Weapon w10 = new Weapon();
		Weapon w11 = new Weapon();
		Weapon w12 = new Weapon();
		Weapon w13 = new Weapon();
		Weapon w14 = new Weapon();
		Weapon w15 = new Weapon();
		Weapon w16 = new Weapon();
		Weapon w17 = new Weapon();
		Weapon w18 = new Weapon();
		Weapon w19 = new Weapon();
		Weapon w20 = new Weapon();
		Weapon w21 = new Weapon();
		Weapon w22 = new Weapon();
		Weapon w23 = new Weapon();
		Weapon w24 = new Weapon();
		Weapon w25 = new Weapon();
		Weapon w26 = new Weapon();
		Weapon w27 = new Weapon();
		Weapon w28 = new Weapon();
		Weapon w29 = new Weapon();
		Weapon w30 = new Weapon();
		Weapon w31 = new Weapon();
		Weapon w32 = new Weapon();
		Weapon w33 = new Weapon();
		Weapon w34 = new Weapon();
		Weapon w35 = new Weapon();
		Weapon w36 = new Weapon();
		Weapon w37 = new Weapon();
		Weapon w38 = new Weapon();
		Weapon w39 = new Weapon();
		Weapon w40 = new Weapon();
		Weapon w41 = new Weapon();
		Weapon w42 = new Weapon();
		Weapon w43 = new Weapon();
		Weapon w44 = new Weapon();
		Weapon w45 = new Weapon();
		Weapon w46 = new Weapon();
		Weapon w47 = new Weapon();
		Weapon w48 = new Weapon();
		Weapon w49 = new Weapon();
		Weapon w50 = new Weapon();
		Weapon w51 = new Weapon();
		Weapon w52 = new Weapon();
		Weapon w53 = new Weapon();
		Weapon w54 = new Weapon();
		Weapon w55 = new Weapon();
		Weapon w56 = new Weapon();
		Weapon w57 = new Weapon();
		Weapon w58 = new Weapon();
		Weapon w59 = new Weapon();
		Weapon w60 = new Weapon();
		
		// Create an array of the Weapons' names
		String names[] = new String[61];
		names[0] = w0.getName();
		names[1] = w1.getName();
		names[2] = w2.getName();
		names[3] = w3.getName();
		names[4] = w4.getName();
		names[5] = w5.getName();
		names[6] = w6.getName();
		names[7] = w7.getName();
		names[8] = w8.getName();
		names[9] = w9.getName();
		names[10] = w10.getName();
		names[11] = w11.getName();
		names[12] = w12.getName();
		names[13] = w13.getName();
		names[14] = w14.getName();
		names[15] = w15.getName();
		names[16] = w16.getName();
		names[17] = w17.getName();
		names[18] = w18.getName();
		names[19] = w19.getName();
		names[20] = w20.getName();
		names[21] = w21.getName();
		names[22] = w22.getName();
		names[23] = w23.getName();
		names[24] = w24.getName();
		names[25] = w25.getName();
		names[26] = w26.getName();
		names[27] = w27.getName();
		names[28] = w28.getName();
		names[29] = w29.getName();
		names[30] = w30.getName();
		names[31] = w31.getName();
		names[32] = w32.getName();
		names[33] = w33.getName();
		names[34] = w34.getName();
		names[35] = w35.getName();
		names[36] = w36.getName();
		names[37] = w37.getName();
		names[38] = w38.getName();
		names[39] = w39.getName();
		names[40] = w40.getName();
		names[41] = w41.getName();
		names[42] = w42.getName();
		names[43] = w43.getName();
		names[44] = w44.getName();
		names[45] = w45.getName();
		names[46] = w46.getName();
		names[47] = w47.getName();
		names[48] = w48.getName();
		names[49] = w49.getName();
		names[50] = w50.getName();
		names[51] = w51.getName();
		names[52] = w52.getName();
		names[53] = w53.getName();
		names[54] = w54.getName();
		names[55] = w55.getName();
		names[56] = w56.getName();
		names[57] = w57.getName();
		names[58] = w58.getName();
		names[59] = w59.getName();
		names[60] = w60.getName();
		
		// Check that all Weapon names are one of WeaponNames
		for(int i = 0; i < 61; i++) {
			if((names[i] != "Gloves") && (names[i] != "Knife") && (names[i] != "Machette") && (names[i] != "Handgun") && (names[i] != "Sword")) {
				fail("Weapon name not one of weaponNames");
			}
		}
		
		
		// Check how many times a Weapon is named "Gloves"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Gloves") {
				glovesCount++;
			}
		}
		
		if(glovesCount==0) {
			fail("Of 61 Weapons, Gloves is never found");
		} else if(glovesCount == 61) {
			fail("Only Glove weapons are created");
		}
		
		// Check how many times a Weapon is named "Knife"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Knife") {
				knifeCount++;
			}
		}
		
		if(knifeCount==0) {
			fail("Of 61 Weapons, Knife is never found");
		} else if(knifeCount == 61) {
			fail("Only knife weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Machette"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Machette") {
				machetteCount++;
			}
		}
		
		if(machetteCount==0) {
			fail("Of 61 Weapons, Machette is never found");
		} else if(machetteCount == 61) {
			fail("Only Machette weapons are created");
		}
		
		// Check how many times a Weapon is named "Handgun"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Handgun") {
				handgunCount++;
			}
		}
		
		if(handgunCount==0) {
			fail("Of 61 Weapons, Handgun is never found");
		} else if(handgunCount == 61) {
			fail("Only Handgun weapons are created");
		}
		
		
		// Check how many times a Weapon is named "Sword"
		for(int i = 0; i < 61; i++) {
			if(names[i] == "Sword") {
				swordCount++;
			}
		}
		
		if(swordCount==0) {
			fail("Of 61 Weapons, Sword is never found");
		} else if(swordCount == 61) {
			fail("Only Sword weapons are created");
		}
	}
}
