package net.Jackson.arcanemod.item.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AccelerateRuneItem extends Item {
    public AccelerateRuneItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(InteractionHand.MAIN_HAND);

        if(!pLevel.isClientSide) {

            pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 5));

            //change this to do less health damage if you are combined with a hexcore
            pPlayer.hurt(pLevel.damageSources().magic(), 4f);


        }else{
            pLevel.addParticle(
                    ParticleTypes.EXPLOSION,
                    pPlayer.getX(),
                    pPlayer.getY(),
                    pPlayer.getZ(),
                    0.0,
                    0.0,
                    0.0
            );

            pLevel.playSound(
                    pPlayer,
                    pPlayer.getX(),
                    pPlayer.getY(),
                    pPlayer.getZ(),
                    SoundEvents.BEACON_ACTIVATE,
                    SoundSource.PLAYERS,
                    1.0f,
                    1.0f
            );


        }




        return InteractionResultHolder.success(itemstack);





    }
}
