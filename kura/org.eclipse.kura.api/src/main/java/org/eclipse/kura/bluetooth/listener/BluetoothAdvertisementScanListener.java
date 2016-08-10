package org.eclipse.kura.bluetooth.listener;

import org.eclipse.kura.bluetooth.BluetoothAdvertisementData;

/**
 * BluetoothAdvertisementScanListener must be implemented by any class
 * wishing to receive BLE advertisement data
 *
 */
public interface BluetoothAdvertisementScanListener {

	/**
	 * Fired when bluetooth advertisement data is received
	 * 
	 * @param advertisementData
	 */
	public void onAdvertisementDataReceived(BluetoothAdvertisementData btAdData);
}
