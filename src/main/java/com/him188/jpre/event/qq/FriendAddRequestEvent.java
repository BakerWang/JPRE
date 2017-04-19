package com.him188.jpre.event.qq;

import com.him188.jpre.QQ;
import com.him188.jpre.RobotQQ;

/**
 * 他人请求添加机器人为好友
 *
 * @author Him188
 */
public class FriendAddRequestEvent extends QQEvent {
	private final QQ requester;

	private boolean accepted;

	public FriendAddRequestEvent(RobotQQ robot, QQ qq, QQ requester) {
		super(robot, qq);
		this.requester = requester;
	}

	public QQ getRequester() {
		return requester;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
}
