package model;

import java.util.Arrays;

public class UploadFile{

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "UploadFile [length=" + length + ", bytes="
				+ Arrays.toString(bytes) + ", name=" + name + ", type=" + type
				+ "]";
	}
	public int length;
    public byte[] bytes;
    public String name;
    public String type;
}
