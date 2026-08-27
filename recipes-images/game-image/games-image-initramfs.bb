# Simple initramfs image. Mostly used for live images.
DESCRIPTION = "meta-games layer test image"

IMAGE_INSTALL = "initramfs-live-boot initramfs-live-install busybox udev base-passwd"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""

export IMAGE_BASENAME = "games-image-initramfs"
IMAGE_LINGUAS = ""

LICENSE = "GPL-2.0-only"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
