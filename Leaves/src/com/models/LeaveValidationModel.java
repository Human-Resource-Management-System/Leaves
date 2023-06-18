package com.models;

public class LeaveValidationModel {
     private int allowedTotalLeaves;
     private int allowedSickLeaves;
     private int allowedCasualLeaves;
     private int allowedOtherLeaves;
     private long takenTotalLeaves;
     private long takenSickLeaves;
     private long takenCasualLeaves;
     private long takenOtherLeaves;
	public int getAllowedTotalLeaves() {
		return allowedTotalLeaves;
	}
	public void setAllowedTotalLeaves(int allowedTotalLeaves) {
		this.allowedTotalLeaves = allowedTotalLeaves;
	}
	public int getAllowedSickLeaves() {
		return allowedSickLeaves;
	}
	public void setAllowedSickLeaves(int allowedSickLeaves) {
		this.allowedSickLeaves = allowedSickLeaves;
	}
	public int getAllowedCasualLeaves() {
		return allowedCasualLeaves;
	}
	public void setAllowedCasualLeaves(int allowedCasualLeaves) {
		this.allowedCasualLeaves = allowedCasualLeaves;
	}
	public int getAllowedOtherLeaves() {
		return allowedOtherLeaves;
	}
	public void setAllowedOtherLeaves(int allowedOtherLeaves) {
		this.allowedOtherLeaves = allowedOtherLeaves;
	}
	public long getTakenTotalLeaves() {
		return takenTotalLeaves;
	}
	public void setTakenTotalLeaves(long takenTotalLeaves) {
		this.takenTotalLeaves = takenTotalLeaves;
	}
	public long getTakenSickLeaves() {
		return takenSickLeaves;
	}
	public void setTakenSickLeaves(long takenSickLeaves) {
		this.takenSickLeaves = takenSickLeaves;
	}
	public long getTakenCasualLeaves() {
		return takenCasualLeaves;
	}
	public void setTakenCasualLeaves(long takenCasualLeaves) {
		this.takenCasualLeaves = takenCasualLeaves;
	}
	public long getTakenOtherLeaves() {
		return takenOtherLeaves;
	}
	public void setTakenOtherLeaves(long takenOtherLeaves) {
		this.takenOtherLeaves = takenOtherLeaves;
	}
	public LeaveValidationModel(int allowedTotalLeaves, int allowedSickLeaves, int allowedCasualLeaves,
			int allowedOtherLeaves, int takenTotalLeaves, int takenSickLeaves, int takenCasualLeaves,
			int takenOtherLeaves) {
		this.allowedTotalLeaves = allowedTotalLeaves;
		this.allowedSickLeaves = allowedSickLeaves;
		this.allowedCasualLeaves = allowedCasualLeaves;
		this.allowedOtherLeaves = allowedOtherLeaves;
		this.takenTotalLeaves = takenTotalLeaves;
		this.takenSickLeaves = takenSickLeaves;
		this.takenCasualLeaves = takenCasualLeaves;
		this.takenOtherLeaves = takenOtherLeaves;
	}
	public LeaveValidationModel() {
	}
     
}
