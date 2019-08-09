package project_07_MonsterHunter_Weapon_DB.WeaponDTO;

public interface IWeaponDTO {
	public abstract void setName(String _name);
	public abstract String getName();
	
	public abstract void setDamage(int _damage);
	public abstract int getDamage();
}
