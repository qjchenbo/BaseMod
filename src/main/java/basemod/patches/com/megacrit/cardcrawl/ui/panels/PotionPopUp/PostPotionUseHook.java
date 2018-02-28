package basemod.patches.com.megacrit.cardcrawl.ui.panels.PotionPopUp;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.potions.AbstractPotion;

import basemod.BaseMod;

@SpirePatch(cls="com.megacrit.cardcrawl.ui.panels.PotionPopUp", method="updateInput")
public class PostPotionUseHook {
	@SpireInsertPatch(rloc=21,localvars= {"potion"})
	public static void Insert(Object __obj_instance, Object potion) {
		AbstractPotion p = (AbstractPotion)potion;
		BaseMod.publishPostPotionUse(p);;
	}
	
}
