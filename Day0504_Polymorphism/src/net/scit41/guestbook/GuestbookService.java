package net.scit41.guestbook;
// C R U D ,������ �� ��ȸ, ��ü �� ��ȸ
public interface GuestbookService {
	public int write (GuestbookVO vo);
	public int delete (int guestbookNo);
	public int update (GuestbookVO vo);
	public GuestbookVO retrieve(int guestbookNo);
}
